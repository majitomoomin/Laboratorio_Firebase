package com.example.firebase_lab.view.login

import androidx.compose.runtime.Composable

@Composable
fun LoginView(){
    Column(horizontalAligment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()) {
        var email by remember {mutableStateOf("")}
        var password by remember {mutableStateOf("")}

        OutLinedTextField(
          value = email,
            onValueChange = {email = it},
            label = {Text("Email")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    }
        )
    }
}))
}