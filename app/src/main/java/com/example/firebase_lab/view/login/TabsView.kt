package com.example.firebase_lab.view.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun TabsView(){
    var selectedTab by remember {
        mutableStateOf(0)
    }
    var tabs = listOf("Login", "Register")

    Column{
        TabRow(selectTabIndex = selectTab,
            indicator ={
                tabPositions ->
                TabRowDefaults.Indicator(
                    modifier = Modifier.tabIndicatorOffset(tabPositions[selectedTab])
                )

            } ) {
            tabs.forEachIndexed{
                index, title ->
                Tab(selected = selectedTab == index,
                    onClick = {selectedTab = index}
                ){
                    Text(text = title)

                }
            }
        }
        when(selectedTab){
            0 -> LoginView()
            1 -> RegisterView()
        }

    }
}