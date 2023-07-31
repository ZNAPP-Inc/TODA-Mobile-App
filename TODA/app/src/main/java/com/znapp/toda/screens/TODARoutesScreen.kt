package com.znapp.toda.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.znapp.toda.ui.composables.CardElevationCaloocan1
import com.znapp.toda.ui.composables.CardElevationCaloocan2
import com.znapp.toda.ui.composables.CardElevationCaloocan3
import com.znapp.toda.ui.composables.CardElevationCaloocan4
import com.znapp.toda.ui.composables.CardElevationCaloocan5
import com.znapp.toda.ui.composables.CardElevationMarikina1
import com.znapp.toda.ui.composables.CardElevationMarikina2
import com.znapp.toda.ui.composables.CardElevationMarikina3
import com.znapp.toda.ui.composables.CardElevationMarikina4
import com.znapp.toda.ui.composables.CardElevationMarikina5
import com.znapp.toda.ui.composables.CardElevationMarikina6
import com.znapp.toda.ui.composables.CardElevationQC1
import com.znapp.toda.ui.composables.CardElevationQC2
import com.znapp.toda.ui.composables.CardElevationQC3
import com.znapp.toda.ui.composables.CardElevationQC4
import com.znapp.toda.ui.composables.CardElevationQC5
import com.znapp.toda.ui.theme.Montserrat
import com.znapp.toda.ui.theme.TODATheme

@Composable
fun TODARoutesScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF191414))
    {}
    TODATheme {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(26.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

            Spacer(modifier = Modifier.height(15.dp)
            )

            Text(
                text = "TODA Routes in Caloocan",
                color = Color.White,
                fontFamily = Montserrat,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )

            CardElevationCaloocan1()

            CardElevationCaloocan2()

            CardElevationCaloocan3()

            CardElevationCaloocan4()

            CardElevationCaloocan5()

            Spacer(modifier = Modifier.height(15.dp)
            )

            Text(
                text = "TODA Routes in Marikina",
                color = Color.White,
                fontFamily = Montserrat,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )

            CardElevationMarikina1()

            CardElevationMarikina2()

            CardElevationMarikina3()

            CardElevationMarikina4()

            CardElevationMarikina5()

            CardElevationMarikina6()

            Spacer(modifier = Modifier.height(15.dp)
            )

            Text(
                text = "TODA Routes in Quezon City",
                color = Color.White,
                fontFamily = Montserrat,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )

            CardElevationQC1()

            CardElevationQC2()

            CardElevationQC3()

            CardElevationQC4()

            CardElevationQC5()

        }
    }
}

@Preview
@Composable
fun TODARoutesScreenPreview() {
    TODARoutesScreen()
}