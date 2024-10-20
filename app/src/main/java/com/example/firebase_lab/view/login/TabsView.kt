package com.example.firebase_lab.view.login

import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun TabsView(innerPadding: PaddingValues = PaddingValues(top = 40.dp)){
    var selectedTab by remember {mutableStateOf(0)}
        mutableStateOf(0)
    var tabs = listOf("Login", "Register")

    Column(modifier = Modifier.padding(innerPadding)){
        TabRow(selectTabIndex = selectTab,
            contentColor = Color.Black,
            containerColor = Color.White,
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