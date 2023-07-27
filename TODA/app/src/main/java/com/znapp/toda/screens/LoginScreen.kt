package com.znapp.toda.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.znapp.toda.R
import com.znapp.toda.ui.composables.RoundedButtonEmail
import com.znapp.toda.ui.composables.RoundedButtonGoogle
import com.znapp.toda.ui.composables.RoundedButtonLogin
import com.znapp.toda.ui.composables.RoundedButtonSignup
import com.znapp.toda.ui.composables.RoundedButtonTODA
import com.znapp.toda.ui.theme.Montserrat
import com.znapp.toda.ui.theme.TODATheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun LoginScreen() {
    Box(
        modifier = with(Modifier) {
            fillMaxSize()
            paint(
                painterResource(id = R.drawable.toda_welcome_bg),
                contentScale = ContentScale.FillBounds
            )
        })
    {}

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back Button"
                        )
                    }
                },
                title = {
                    Text(text = "Log in")
                }
            )
        },
        content = {
        }
    )

    TODATheme {
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Spacer(modifier = Modifier.height(270.dp)
            )

            Text(
                text = "Welcome back",
                color = Color.White,
                fontFamily = Montserrat,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )

            Text(
                text = "Enter your log in details to continue",
                color = Color.White,
                fontFamily = Montserrat,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(15.dp)
            )

            RoundedButtonEmail(text = " Sign up with Email") {
            }

            Spacer(modifier = Modifier.height(13.dp)
            )

            RoundedButtonGoogle(text = " Continue with Google") {
            }

            Spacer(modifier = Modifier.height(15.dp)
            )

            RoundedButtonLogin(text = "Log in") {
            }
        }
    }
}
@ExperimentalMaterial3Api
@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}