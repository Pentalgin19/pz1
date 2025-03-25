package com.example.pz1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.pz1.ui.theme.Pz1Theme
import android.util.Log
import android.content.ContentValues.TAG

class DialogActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreateDialog")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pz1Theme {
                DialogFun()
            }
        }
    }
}

@Composable
fun DialogFun() {
    Row(modifier = Modifier.fillMaxSize()) {
        Text(
            "Это диалоговая активность",
            fontSize = 28.sp,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterVertically),
            textAlign = TextAlign.Center
        )
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DialogPreview() {
    DialogFun()
}