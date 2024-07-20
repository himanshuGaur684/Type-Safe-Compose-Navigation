package gaur.himanshu.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun AuthScreen(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Box(modifier = modifier
        .clickable { onClick.invoke() }
        .fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = "Auth Screen")
    }
}