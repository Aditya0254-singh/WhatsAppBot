<h1 align="center">💬 WhatsApp Chatbot Backend – Java + Spring Boot + Firebase</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17+-red?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring_Boot-Backend-brightgreen?style=for-the-badge&logo=springboot&logoColor=white" />
  <img src="https://img.shields.io/badge/Firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=black" />
  <img src="https://img.shields.io/badge/Meta-WhatsApp_Cloud_API-25D366?style=for-the-badge&logo=whatsapp&logoColor=white" />
  <img src="https://img.shields.io/badge/Build-Maven-blue?style=for-the-badge&logo=apachemaven&logoColor=white" />
</p>

---

## 📖 Project Overview

This project is a **Java Spring Boot backend** designed for building WhatsApp Chatbots using the **Meta WhatsApp Business Cloud API**.  

It demonstrates how to:
- Handle **real-time incoming and outgoing messages** through secure webhooks.
- Implement **webhook verification** to ensure trusted sources.
- Manage credentials and authentication via **Firebase Admin SDK**.

This backend can serve as the core of production-level applications such as **customer support bots**, **automated notification systems**, or **marketing assistants**.

---

## ✨ Features

- ✅ Real-time message handling via Meta Webhooks  
- 🔐 Secure webhook verification system  
- 🔥 Firebase Admin SDK integration for credentials & authentication  
- 🧱 Modular, scalable Spring Boot architecture  
- 🌐 Ready for cloud deployment (Render / AWS / GCP)

---

## 🧠 Tech Stack

- ☕ **Java 17+**  
- 🌿 **Spring Boot** (REST API backend)  
- 💬 **Meta WhatsApp Business Cloud API**  
- 🔥 **Firebase Admin SDK**  
- 🧰 **Maven** (build tool)

---

## 🧰 Project Setup

### 1️⃣ Clone the Repository

`bash
git clone https://github.com/Aditya0254-singh/WhatsAppBot.git
cd WhatsAppBot`

### 2️⃣ Configure Environment Variables

Create a .env file in the root directory and add the following:

`bash
FIREBASE_CREDENTIALS_PATH=path/to/serviceAccountKey.json
WHATSAPP_TOKEN=your_meta_api_token
VERIFY_TOKEN=your_webhook_verify_token`

### 3️⃣ Build the Project

`bash
mvn clean install`

### 4️⃣ Run the Application

`bash
java -jar target/WhatsAppBot.jar`

---

## 📡 Webhook Example

Verification Request
`bash
GET /webhook?hub.mode=subscribe&hub.verify_token=YOUR_TOKEN&hub.challenge=12345`

Incoming Message Payload:

`json{
  "object": "whatsapp_business_account",
  "entry": [
    {
      "changes": [
        {
          "value": {
            "messages": [
              {
                "from": "919876543210",
                "text": { "body": "Hello Bot!" }
              }
            ]
          }
        }
      ]
    }
  ]
}`

---

## 🧪 Local Testing

Use ngrok
 to expose your local server to the internet:

`bash
ngrok http 8080
`
Then configure the generated public URL as your webhook endpoint in Meta’s developer console.

---

## 🚀 Future Enhancements

- ✅ Support for rich message templates and media

- ✅ Add a dashboard for conversation logs & analytics

- 🌐 Implement CI/CD pipeline with GitHub Actions

- 🧠 Role-based access control for admin users

---

## 📝 Notes

- Requires Java 17+ and Maven installed.

- Your WhatsApp Business Cloud API must be set up and verified.

- Firebase Admin SDK credentials must match your project configuration.

---

## 👨‍💻 Author
Aditya Singh

- [📧Email] (adityasinghgzp609@gmail.com)

- [💼 LinkedIn] (https://www.linkedin.com/in/aditya-singh-baa980257/)

- [🌐 GitHub] (https://github.com/Aditya0254-singh)

---

<p align="center">⭐ If you found this project useful, please consider giving it a star!</p> ```

---

