💬 WhatsApp Chatbot Backend
A robust backend service for a WhatsApp chatbot, built with Java and Spring Boot. This project demonstrates real-time messaging, secure webhook handling, and integration with the WhatsApp Business Cloud API.

🚀 Features
-> Real-time Messaging: Handles incoming and outgoing messages instantly via webhooks.

-> Secure Webhook Verification: Implements a webhook verification system to ensure all requests are from a trusted source.

-> Firebase Integration: Manages and secures service account credentials for backend operations using Firebase Admin SDK.

💻 Tech Stack
-> Backend: Java, Spring Boot

-> API: Meta's WhatsApp Business Cloud API

-> Authentication: Firebase Admin SDK

-> Build Tool: Maven

⚙️ Getting Started
Follow these instructions to set up and run the project locally.

**Prerequisites**
-> Java 17 or higher
-> Maven
-> A registered WhatsApp Business Account with a Cloud API setup
-> A Firebase project with Admin SDK credentials

**Installation**

1. Clone the repository:
                       git clone [https://github.com/Aditya0254-singh/WhatsAppBot](https://github.com/Aditya0254-singh/WhatsAppBot)
                       cd WhatsAppBot

2. Configure your credentials:
                       Create a .env file in the project root.
                       Add your Firebase service account credentials and WhatsApp API tokens to this file.

3. Install dependencies and build the project:
                       mvn clean install

4. Run the application:
                      java -jar target/WhatsAppBot.jar

🤝 Contribution
Feel free to open issues or submit pull requests.
