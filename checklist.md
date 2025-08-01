# Location Ping App - Minimum Viable Product Checklist

This is a beginner-friendly 10-step guide to build an Android app that lets two paired users manually "ping" each other for a one-time location update.  
Each step includes a **goal** and a **proof of concept (PoC)** you should verify before moving on.

---

## 1️⃣ Install and Set Up Development Environment
- **Goal:** Install Android Studio and create a new Kotlin project ("Empty Activity").
- **PoC:** You can build and run a “Hello World” app on your Android phone via USB.

---

## 2️⃣ Create a Firebase Project
- **Goal:** In [Firebase Console](https://console.firebase.google.com/), create a project, add your Android app package name, and download `google-services.json`.
- **PoC:** Place `google-services.json` in your project’s `app/` folder and sync Gradle successfully.

---

## 3️⃣ Enable Firebase Authentication
- **Goal:** Turn on **Anonymous Sign-In** in Firebase Authentication settings.
- **PoC:** Run the app, and confirm in Firebase Console → Authentication tab that a new anonymous user appears.

---

## 4️⃣ Enable Firestore Database
- **Goal:** Set up **Cloud Firestore** in test mode.
- **PoC:** From the app, write a test value to Firestore and confirm it appears in the console.

---

## 5️⃣ Set Up Firebase Messaging (Push Notifications)
- **Goal:** Enable **Cloud Messaging**, fetch device FCM token, and save it in Firestore (`users` collection).
- **PoC:** Each time the app runs, you see a unique token appear in your Firestore database for your device.

---

## 6️⃣ Build Basic UI with Ping Button
- **Goal:** Add a single button `Ping`. When clicked, it writes a document `{from: yourId, type: "PING"}` to Firestore.
- **PoC:** You press the button and see a new "ping" entry in Firestore under the `pings` collection.

---

## 7️⃣ Listen for Pings
- **Goal:** Make your wife's phone listen to the `pings` collection for entries addressed to her user ID.
- **PoC:** From your phone, press Ping → wife's phone logs `"Ping received from <yourId>"` in Logcat (no UI yet).

---

## 8️⃣ Respond with Location
- **Goal:** On receiving a ping, her phone fetches last known location via Fused Location Provider and updates the ping document with `{lat, lng}`.
- **PoC:** Firestore ping entry now contains a `response` object with coordinates after pinging.

---

## 9️⃣ Display Location on Your Phone
- **Goal:** Your phone listens for the ping response and shows coordinates or drops a pin on a Google Map (use Maps SDK).
- **PoC:** After ping, you see your wife’s location printed in the app or visually pinned on a map.

---

## 🔟 Package and Test MVP
- **Goal:** Build a signed APK, install it manually on both phones, test end-to-end:
  1. Press Ping → Firestore updates  
  2. Wife’s phone responds automatically  
  3. Location appears on your phone.
- **PoC:** Repeat this test from both phones successfully without Firebase Console intervention.

---
