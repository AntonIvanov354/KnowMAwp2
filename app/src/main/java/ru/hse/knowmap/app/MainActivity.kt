package ru.hse.knowmap.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ru.hse.knowmap.app.ui.theme.KnowMapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KnowMapTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopNavigationBar()
                    }
                ) { innerPadding ->
                    // Здесь можно добавить содержимое вашего Scaffold
                    // Например, контент может быть обернут в PaddingValues, чтобы избежать перекрытия с TopAppBar
                    Column(modifier = Modifier.padding(innerPadding)) {
                        // Ваш контент здесь
                        Text(text = "Main Content Here")
                    }
                }
            }
        }
    }
@Composable
fun BottomNavigationBar(){
    BottomNavigation(
        backColor = MaterialTheme.colors.primarySurface,
        contentColor =  MaterialTheme.colors.onPrimary,
    ){
        BottomNavigationItem(
            icon = {
                Icon(
                    imgaVector = ImageVector.vectorResource(id = R.drawable.ic_history),
                    contentDescription  = "History*/
                )
            },
            selected = false
            onClick = {
                
            }
        )
    }
}
