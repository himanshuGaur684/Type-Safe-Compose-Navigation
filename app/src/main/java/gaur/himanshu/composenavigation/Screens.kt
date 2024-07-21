package gaur.himanshu.composenavigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun AuthFirst(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Auth First Screen", modifier = Modifier.clickable { onClick.invoke() })
    }
}

@Composable
fun AuthSecond(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Auth Second Screen", modifier = Modifier.clickable { onClick.invoke() })
    }
}


@Composable
fun DashFirst(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Dash First Screen", modifier = Modifier.clickable { onClick.invoke() })
    }
}

@Composable
fun DashSecond(dash:Dest.DashSecondScreen, onClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Dash Second Screen ${dash.dummy.name} ${dash.dummy.age}", modifier = Modifier.clickable { onClick.invoke() })
    }
}