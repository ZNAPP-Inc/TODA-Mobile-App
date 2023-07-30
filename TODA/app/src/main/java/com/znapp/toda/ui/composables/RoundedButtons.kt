package com.znapp.toda.ui.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.znapp.toda.R
import com.znapp.toda.ui.theme.PublicSans
import com.znapp.toda.ui.theme.TODATheme

@Composable
fun RoundedButtonGoogle(
    text: String,
    modifier: Modifier = Modifier,
    onClick: ()->Unit

){

    Button(
        onClick = onClick,
        modifier = modifier,
        shape = CircleShape,
        elevation = ButtonDefaults.buttonElevation(0.dp,0.dp),
        contentPadding = PaddingValues(20.dp,12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color.White, contentColor = Color.Unspecified)
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.google_icon),
            contentDescription = null,
            modifier = Modifier.padding(end = 4.dp)
            )
            Text(text = text,
                color = Color.Black,
                fontFamily = PublicSans,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                textAlign = TextAlign.Center
        )
    }
}

@Composable
fun RoundedButtonEmail(
    text: String,
    modifier: Modifier = Modifier,
    onClick: ()->Unit

){

    Button(
        onClick = onClick,
        modifier = modifier,
        shape = CircleShape,
        elevation = ButtonDefaults.buttonElevation(0.dp,0.dp),
        contentPadding = PaddingValues(20.dp,12.dp),
        border = BorderStroke(2.dp,Color.White),
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent, contentColor = Color.White)
    ) {
        Icon(
            imageVector = Icons.Outlined.Email,
            contentDescription = null,
            modifier = Modifier
                .padding(end = 4.dp)
                .size(16.dp)
        )
        Text(text = text,
            color = Color.White,
            fontFamily = PublicSans,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun RoundedButtonTODA(
    text: String,
    modifier: Modifier = Modifier,
    onClick: ()->Unit

){

    Button(
        onClick = onClick,
        modifier = modifier,
        shape = CircleShape,
        elevation = ButtonDefaults.buttonElevation(0.dp,0.dp),
        contentPadding = PaddingValues(20.dp,12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1DB954), contentColor = Color.Unspecified)
    ) {
        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = null,
            modifier = Modifier
                .padding(end = 4.dp)
                .size(18.dp)
        )
        Text(text = text,
            color = Color.Black,
            fontFamily = PublicSans,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun RoundedButtonSignup(
    text: String,
    modifier: Modifier = Modifier,
    onClick: ()->Unit

){

    Button(
        onClick = onClick,
        modifier = modifier,
        shape = CircleShape,
        elevation = ButtonDefaults.buttonElevation(0.dp,0.dp),
        contentPadding = PaddingValues(20.dp,12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1DB954), contentColor = Color.Unspecified)
    ) {
        Text(text = text,
            color = Color.Black,
            fontFamily = PublicSans,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun RoundedButtonLogin(
    text: String,
    modifier: Modifier = Modifier,
    onClick: ()->Unit

){

    Button(
        onClick = onClick,
        modifier = modifier,
        shape = CircleShape,
        elevation = ButtonDefaults.buttonElevation(0.dp,0.dp),
        contentPadding = PaddingValues(20.dp,12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1DB954), contentColor = Color.Unspecified)
    ) {
        Text(text = text,
            color = Color.Black,
            fontFamily = PublicSans,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun RoundedButtonHomeCaloocan(
    text: String,
    modifier: Modifier = Modifier,
    onClick: ()->Unit

){

    Button(
        onClick = onClick,
        modifier = modifier,
        shape = CircleShape,
        elevation = ButtonDefaults.buttonElevation(0.dp,0.dp),
        contentPadding = PaddingValues(20.dp,12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1DB954), contentColor = Color(0xFF1DB954))
    ) {
        Text(text = text,
            color = Color.Black,
            fontFamily = PublicSans,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun RoundedButtonHomeMarikina(
    text: String,
    modifier: Modifier = Modifier,
    onClick: ()->Unit

){

    Button(
        onClick = onClick,
        modifier = modifier,
        shape = CircleShape,
        elevation = ButtonDefaults.buttonElevation(0.dp,0.dp),
        contentPadding = PaddingValues(20.dp,12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1DB954), contentColor = Color(0xFF1DB954))
    ) {
        Text(text = text,
            color = Color.Black,
            fontFamily = PublicSans,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun RoundedButtonHomeManila(
    text: String,
    modifier: Modifier = Modifier,
    onClick: ()->Unit

){

    Button(
        onClick = onClick,
        modifier = modifier,
        shape = CircleShape,
        elevation = ButtonDefaults.buttonElevation(0.dp,0.dp),
        contentPadding = PaddingValues(20.dp,12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1DB954), contentColor = Color(0xFF1DB954))
    ) {
        Text(text = text,
            color = Color.Black,
            fontFamily = PublicSans,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}
@Composable
fun RoundedButtonHomeQuezonCity(
    text: String,
    modifier: Modifier = Modifier,
    onClick: ()->Unit

){

    Button(
        onClick = onClick,
        modifier = modifier,
        shape = CircleShape,
        elevation = ButtonDefaults.buttonElevation(0.dp,0.dp),
        contentPadding = PaddingValues(20.dp,12.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1DB954), contentColor = Color(0xFF1DB954))
    ) {
        Text(text = text,
            color = Color.Black,
            fontFamily = PublicSans,
            fontWeight = FontWeight.SemiBold,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun RoundedButtonGooglePreview() {
    TODATheme {
        RoundedButtonGoogle(text = " Continue with Google") {
        }
    }
}

@Preview
@Composable
fun RoundedButtonTODAPreview() {
    TODATheme {
        RoundedButtonTODA(text = " Log in with TODA Account") {
        }
    }
}

@Preview
@Composable
fun RoundedButtonSignupPreview() {
    TODATheme {
        RoundedButtonSignup(text = "Sign up") {
        }
    }
}

@Preview
@Composable
fun RoundedButtonLoginPreview() {
    TODATheme {
        RoundedButtonLogin(text = "Login") {
        }
    }
}



@Preview
@Composable
fun RoundedButtonEmailPreview() {
    TODATheme {
        RoundedButtonEmail(text = " Sign up with Email") {
        }
    }
}

@Preview
@Composable
fun RoundedButtonHomeCaloocan() {
    TODATheme {
        RoundedButtonHomeCaloocan(text = "Caloocan") {
        }
    }
}

@Preview
@Composable
fun RoundedButtonHomeMarikina() {
    TODATheme {
        RoundedButtonHomeMarikina(text = "Marikina") {
        }
    }
}

@Preview
@Composable
fun RoundedButtonHomeManila() {
    TODATheme {
        RoundedButtonHomeManila(text = "Manila") {
        }
    }
}

@Preview
@Composable
fun RoundedButtonHomeQuezonCity() {
    TODATheme {
        RoundedButtonHomeQuezonCity(text = "Quezon City") {
        }
    }
}