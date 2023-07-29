package com.znapp.toda.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.znapp.toda.ui.theme.Montserrat
import com.znapp.toda.ui.theme.PublicSans

@Composable
fun CardElevationCaloocan1() {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFF1DB954),
        modifier = Modifier
            .height(410.dp)
            .padding(10.dp),
        shadowElevation = 10.dp
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(2f),
                verticalArrangement = Arrangement.Center
            ) {
                Surface(
                    shape = RoundedCornerShape(24.dp),
                    modifier = Modifier.wrapContentSize(),
                    color = Color(0xFF41E17A)
                ) {
                    Text(
                        text = "TODA Station in Caloocan",
                        fontSize =  12.sp,
                        fontFamily = PublicSans,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "PALTODA Phase 3 to Palmera Springs Phase 1",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 1.4 km\n" +
                                "Estimated Time of Travel: 5 minutes\n" +
                                "Fare: ₱30 (Inside Sidecar), ₱15 (Back ride)\n" +
                                "Discounted Fare: ₱10-₱12 (Back ride, Student and Senior Citizen Discount)\n" +
                                "Waiting Area: In front of Alfamart Palmera Springs Phase 3, beside Our Lady of Gualadupe Parish Church.\n",
                        fontSize =  16.sp,
                        fontWeight = FontWeight.Normal,
                        fontFamily = PublicSans,
                        style = LocalTextStyle.current.merge(
                            TextStyle(
                                lineHeight = 1.5.em,
                                platformStyle = PlatformTextStyle(
                                    includeFontPadding = false
                                    ),
                                    lineHeightStyle = LineHeightStyle(
                                        alignment = LineHeightStyle.Alignment.Center,
                                        trim = LineHeightStyle.Trim.None)
                            )
                        )
                    )
                }

                Button(
                        shape = CircleShape,
                        colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Black,
                        containerColor = Color.White
                    ),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = "View in Maps",
                        fontSize =  12.sp,
                        fontWeight = FontWeight.SemiBold,
                        style = MaterialTheme.typography.titleLarge
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun CardElevationCaloocan1Preview(){
    CardElevationCaloocan1()
}
