package com.example.pz1

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pz1.ui.theme.Pz1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pz1Theme {
                MainFun()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    @Composable
    fun MainFun() {
        Row(modifier = Modifier.fillMaxSize().padding(20.dp)) {
            Column(modifier = Modifier.align(Alignment.CenterVertically)) {
                Button(onClick = {
                    startActivity(
                        Intent(
                            this@MainActivity,
                            NormalActivity::class.java
                        )
                    )
                }, modifier = Modifier.fillMaxWidth())
                {
                    Text("Запуск нормальной активности")
                }
                Button(onClick = {
                    startActivity(
                        Intent(
                            this@MainActivity,
                            DialogActivity::class.java
                        )
                    )
                }, modifier = Modifier.fillMaxWidth()) { Text("Запуск диалоговой активности") }
            }
        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun MainPreview() {
        MainFun()
    }
}