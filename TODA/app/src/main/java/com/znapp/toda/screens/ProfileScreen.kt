package com.znapp.toda.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Login
import androidx.compose.material.icons.outlined.Logout
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.znapp.toda.R
import com.znapp.toda.ui.theme.Montserrat
import com.znapp.toda.ui.theme.PublicSans

@Composable
fun ProfileScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF191414)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile_pic_example),
                contentDescription = "Profile picture",
                modifier = Modifier
                    .size(150.dp)
                    .clip(shape = RoundedCornerShape(size = 30f)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Bernard Narceda",
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                color = Color.White,
                fontFamily = Montserrat,
                fontWeight = FontWeight.Bold,
            )
            Spacer(modifier = Modifier.height(16.dp)
            )

            Button(
                onClick = {},
                shape = CircleShape,
                elevation = ButtonDefaults.buttonElevation(0.dp, 0.dp),
                contentPadding = PaddingValues(20.dp, 12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF601410),
                    contentColor = Color.White
                )
            ) {
                Icon(
                    imageVector = Icons.Outlined.Logout,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .size(18.dp)
                )
                Text(
                    text = " Sign out",
                    color = Color.White,
                    fontFamily = PublicSans,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}
