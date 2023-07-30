package com.znapp.toda.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
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
import com.znapp.toda.ui.composables.RoundedButtonHomeCaloocan
import com.znapp.toda.ui.composables.RoundedButtonHomeManila
import com.znapp.toda.ui.composables.RoundedButtonHomeMarikina
import com.znapp.toda.ui.composables.RoundedButtonHomeQuezonCity
import com.znapp.toda.ui.composables.RoundedButtonTODA
import com.znapp.toda.ui.theme.Montserrat
import com.znapp.toda.ui.theme.TODATheme

@Composable
fun HomeScreen() {
    Box(
        modifier = with(Modifier) {
            fillMaxSize()
            paint(
                painterResource(id = R.drawable.toda_welcome_bg),
                contentScale = ContentScale.FillBounds
            )
        })
    {}
    TODATheme {
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Spacer(modifier = Modifier.height(290.dp)
            )

            Text(
                text = "View TODA Routes",
                color = Color.White,
                fontFamily = Montserrat,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )

            Text(
                text = "View available routes from these cities:",
                color = Color.White,
                fontFamily = Montserrat,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(15.dp)
            )

            RoundedButtonHomeCaloocan(text = "Caloocan") {
            }

            Spacer(modifier = Modifier.height(15.dp)
            )

            RoundedButtonHomeMarikina(text = "Marikina") {
            }

            Spacer(modifier = Modifier.height(15.dp)
            )

            RoundedButtonHomeManila(text = "Manila") {
            }

            Spacer(modifier = Modifier.height(15.dp)
            )

            RoundedButtonHomeQuezonCity(text = "Quezon City") {
            }

            Spacer(modifier = Modifier.height(20.dp)
            )
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}