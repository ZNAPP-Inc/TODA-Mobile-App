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

@Composable
fun CardElevationCaloocan2() {
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
                    text = "PALTODA Terminal Phase 5 to Palmera Springs Subdivision Phase 1",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 1.8 km\n" +
                                "Estimated Time of Travel: 6 minutes\n" +
                                "Fare: ₱30 (Inside Sidecar), ₱15 (Back ride)\n" +
                                "Discounted Fare: ₱10-₱12 (Back ride, Student and Senior Citizen Discount)\n" +
                                "Waiting Area: Senate Avenue, beside Corner Mini Grocery.\n",
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
fun CardElevationCaloocan2Preview(){
    CardElevationCaloocan2()
}

@Composable
fun CardElevationCaloocan3() {
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
                    text = "PALTODA Terminal Phase 3 to Zabarte Town Center",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 1.7 km\n" +
                                "Estimated Time of Travel: 8-10 minutes\n" +
                                "Fare: ₱35 (Inside Sidecar), ₱20 (Back ride)\n" +
                                "Discounted Fare: ₱15 (Back ride, Student and Senior Citizen Discount)\n" +
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
fun CardElevationCaloocan3Preview(){
    CardElevationCaloocan3()
}

@Composable
fun CardElevationCaloocan4() {
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
                    text = "PALTODA Waiting Area Zabarte Town Center to PALTODA Terminal Phase 3",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 1.7 km\n" +
                                "Estimated Time of Travel: 8-10 minutes\n" +
                                "Fare: ₱35 (Inside Sidecar), ₱20 (Back ride)\n" +
                                "Discounted Fare: ₱15 (Back ride, Student and Senior Citizen Discount)\n" +
                                "Waiting Area: In front of Savemore Supermarket, Zabarte Town Center.\n",
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
fun CardElevationCaloocan4Preview(){
    CardElevationCaloocan4()
}

@Composable
fun CardElevationCaloocan5() {
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
                    text = "PALTODA Terminal Phase 5 to PALTODA Waiting Area Zabarte Town Center",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 2.2 km\n" +
                                "Estimated Time of Travel: 10-12 minutes\n" +
                                "Fare: ₱35 (Inside Sidecar), ₱20 (Back ride)\n" +
                                "Discounted Fare: ₱15 (Back ride, Student and Senior Citizen Discount)\n" +
                                "Waiting Area: Senate Avenue, beside Corner Mini Grocery.\n",
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
fun CardElevationCaloocan5Preview(){
    CardElevationCaloocan5()
}

@Composable
fun CardElevationMarikina1() {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFF1DB954),
        modifier = Modifier
            .height(330.dp)
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
                        text = "TODA Station in Marikina",
                        fontSize =  12.sp,
                        fontFamily = PublicSans,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "LPSTODAI Terminal to SRMTTODAI Terminal",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 2.3 km\n" +
                                "Estimated Time of Travel: 6 minutes\n" +
                                "Fare: ₱20\n" +
                                "Waiting Area: Don Gozalo Puyat tricycle station, beside Cynnetha Bakery.\n",
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
fun CardElevationMarikina1Preview(){
    CardElevationMarikina1()
}

@Composable
fun CardElevationMarikina2() {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFF1DB954),
        modifier = Modifier
            .height(330.dp)
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
                        text = "TODA Station in Marikina",
                        fontSize =  12.sp,
                        fontFamily = PublicSans,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "LPSTODAI Terminal to DACATODAI Terminal",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 2.8 km\n" +
                                "Estimated Time of Travel: 7 minutes\n" +
                                "Fare: ₱20\n" +
                                "Waiting Area: Don Gozalo Puyat tricycle station, DACATODAI tricycle station.\n",
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
fun CardElevationMarikina2Preview(){
    CardElevationMarikina2()
}

@Composable
fun CardElevationMarikina3() {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFF1DB954),
        modifier = Modifier
            .height(330.dp)
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
                        text = "TODA Station in Marikina",
                        fontSize =  12.sp,
                        fontFamily = PublicSans,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "LPSTODAI Terminal to SELVTODAI Terminal",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 1.9 km\n" +
                                "Estimated Time of Travel: 5 minutes\n" +
                                "Fare: ₱20\n" +
                                "Waiting Area: Don Gozalo Puyat tricycle station, beside Sta. Elena High school.\n",
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
fun CardElevationMarikina3Preview(){
    CardElevationMarikina3()
}

@Composable
fun CardElevationMarikina4() {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFF1DB954),
        modifier = Modifier
            .height(350.dp)
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
                        text = "TODA Station in Marikina",
                        fontSize =  12.sp,
                        fontFamily = PublicSans,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "LPSTODAI Terminal to JCSTODAI Terminal",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 2 km\n" +
                                "Estimated Time of Travel: 6 minutes\n" +
                                "Fare: ₱20\n" +
                                "Waiting Area: Don Gozalo Puyat tricycle station, beside Sta. Elena High school at the JSCTODAI tricycle station.\n",
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
fun CardElevationMarikina4Preview() {
    CardElevationMarikina4()
}

@Composable
fun CardElevationMarikina5() {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFF1DB954),
        modifier = Modifier
            .height(350.dp)
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
                        text = "TODA Station in Marikina",
                        fontSize =  12.sp,
                        fontFamily = PublicSans,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "LPSTODAI Terminal to PTJTODAI Terminal",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 700 m\n" +
                                "Estimated Time of Travel: 2 minutes\n" +
                                "Fare: ₱20\n" +
                                "Waiting Area: Don Gozalo Puyat tricycle station, inside the Provident Village PTJTODAI tricycle station.\n",
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
fun CardElevationMarikina5Preview() {
    CardElevationMarikina5()
}

@Composable
fun CardElevationMarikina6() {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFF1DB954),
        modifier = Modifier
            .height(350.dp)
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
                        text = "TODA Station in Marikina",
                        fontSize =  12.sp,
                        fontFamily = PublicSans,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "LPSTODAI Terminal to KATODAI Terminal",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 4.3 km\n" +
                                "Estimated Time of Travel: 8 minutes\n" +
                                "Fare: ₱20\n" +
                                "Waiting Area: Don Gozalo Puyat tricycle station, MA Roxas tricycle station and near Uratex Marikina.\n",
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
fun CardElevationMarikina6Preview() {
    CardElevationMarikina6()
}

@Composable
fun CardElevationQC1() {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFF1DB954),
        modifier = Modifier
            .height(280.dp)
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
                        text = "TODA Station in Quezon City",
                        fontSize =  12.sp,
                        fontFamily = PublicSans,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "PANSOL TODA to ABADA TODA",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 2.5 km\n" +
                                "Estimated Time of Travel: 8 minutes\n" +
                                "Fare: ₱15 (each passenger), ₱40 (special)\n" +
                                "Waiting Area: In front of Big Brew Pansol.\n",
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
fun CardElevationQC1Preview() {
    CardElevationQC1()
}

@Composable
fun CardElevationQC2() {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFF1DB954),
        modifier = Modifier
            .height(310.dp)
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
                        text = "TODA Station in Quezon City",
                        fontSize =  12.sp,
                        fontFamily = PublicSans,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "DAANTBO TODA to ABADA TODA",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 1.9 km\n" +
                                "Estimated Time of Travel: 5 minutes\n" +
                                "Fare: ₱15 (each passenger), ₱40 (special)\n" +
                                "Waiting Area: Below the Overpass Bridge.\n",
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
fun CardElevationQC2Preview() {
    CardElevationQC2()
}

@Composable
fun CardElevationQC3() {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFF1DB954),
        modifier = Modifier
            .height(330.dp)
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
                        text = "TODA Station in Quezon City",
                        fontSize =  12.sp,
                        fontFamily = PublicSans,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "B.GONZALES TODA to ABADA TODA",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 1.1 km\n" +
                                "Estimated Time of Travel: 4 minutes\n" +
                                "Fare: ₱12 (each passenger), ₱30 (special)\n" +
                                "Waiting Area: Beside Philand Security Agency.\n",
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
fun CardElevationQC3Preview() {
    CardElevationQC3()
}

@Composable
fun CardElevationQC4() {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFF1DB954),
        modifier = Modifier
            .height(360.dp)
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
                        text = "TODA Station in Quezon City",
                        fontSize =  12.sp,
                        fontFamily = PublicSans,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "DITODA MEZZA II to 164 Kapiligan St., Brgy. Doña Imelda",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 1.7 km\n" +
                                "Estimated Time of Travel: 4 minutes\n" +
                                "Fare: ₱30 (Inside Sidecar), ₱15 (Back ride)\n" +
                                "Discounted Fare: ₱10-₱12 (Back ride, Student and Senior Citizen Discount)\n" +
                                "Waiting Area: In front of MEZZA II.\n",
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
fun CardElevationQC4Preview(){
    CardElevationQC4()
}

@Composable
fun CardElevationQC5() {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFF1DB954),
        modifier = Modifier
            .height(360.dp)
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
                        text = "TODA Station in Quezon City",
                        fontSize =  12.sp,
                        fontFamily = PublicSans,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "DITODA KARIDAD to 164 Kapiligan St., Brgy. Doña Imelda",
                    fontSize =  20.sp,
                    fontFamily = Montserrat,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(2.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Distance: 900 m\n" +
                                "Estimated Time of Travel: 3 minutes\n" +
                                "Fare: ₱20 (Inside Sidecar), ₱10 (Back ride)\n" +
                                "Discounted Fare: ₱10 (Back ride, Student and Senior Citizen Discount)\n" +
                                "Waiting Area: Carlos L. Albert High School.\n",
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
fun CardElevationQC5Preview(){
    CardElevationQC5()
}
