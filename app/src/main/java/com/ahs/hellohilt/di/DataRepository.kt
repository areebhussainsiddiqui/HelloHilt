package com.ahs.hellohilt.di

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject


class DataRepository @Inject constructor(private val firestore: FirebaseFirestore) {

    fun greetings(collection: String): LiveData<List<String>> {
        val liveData = MutableLiveData<List<String>>()
        firestore.collection(collection)
            .get().addOnSuccessListener { result ->
                val data = result.map { it.getString("username") ?: "" }
                liveData.value = data
            }
            .addOnFailureListener { exception ->
                liveData.value = listOf("Error ${exception.message}")
            }

        return liveData
    }
}