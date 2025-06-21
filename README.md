# HelloHilt

A simple Android app demonstrating **Hilt** for dependency injection with **ViewModel**, **Firebase Firestore**, and **LiveData**. Built to learn and apply modern Android development best practices.

## 🔧 Tech Stack

- Kotlin
- Hilt (Dependency Injection)
- ViewModel (Lifecycle-aware data handling)
- LiveData (Observable data holder)
- Firebase Firestore (NoSQL cloud database)

## 🚀 Features

- Uses Hilt to inject dependencies into ViewModel and Activity
- Observes LiveData from ViewModel
- Fetches a collection from Firebase Firestore and displays it in the UI

## 🧠 Learning Objectives

- Understand how to use `@HiltViewModel` and `@AndroidEntryPoint`
- Set up dependency injection in an Android app with Hilt
- Fetch data from Firestore using a repository pattern
- Observe LiveData in an activity using `by viewModels()`
