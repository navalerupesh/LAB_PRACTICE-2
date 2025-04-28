#include <iostream>
#include <string>
using namespace std;

void chatbotResponse(const string &input) {
    if (input == "hello" || input == "hi") {
        cout << "Chatbot: Hello! How can I help you today?" << endl;
    } else if (input == "help") {
        cout << "Chatbot: Sure, I'm here to assist you. What do you need help with?" << endl;
    } else if (input == "bye" || input == "exit") {
        cout << "Chatbot: Goodbye! Have a great day!" << endl;
    } else if (input == "hours") {
        cout << "Chatbot: Our working hours are from 9 AM to 6 PM, Monday to Friday." << endl;
    } else if (input == "contact") {
        cout << "Chatbot: You can contact us at support@example.com or call (123) 456-7890." << endl;
    } else {
        cout << "Chatbot: I'm sorry, I didn't understand that. Could you please rephrase?" << endl;
    }
}

int main() {
    string userInput;
    cout << "Welcome to the Customer Support Chatbot!" << endl;
    cout << "Type 'exit' to end the chat." << endl;

    while (true) {
        cout << "You: ";
        getline(cin, userInput);

        if (userInput == "exit" || userInput == "bye") {
            chatbotResponse(userInput);
            break;
        }

        chatbotResponse(userInput);
    }

    return 0;
}
