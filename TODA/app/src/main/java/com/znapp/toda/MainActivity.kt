package com.znapp.toda

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.znapp.toda.navigation.SetupNavGraph
import com.znapp.toda.ui.composables.RoundedButtonGoogle
import com.znapp.toda.ui.composables.RoundedButtonGooglePreview
import com.znapp.toda.ui.theme.TODATheme

class MainActivity : ComponentActivity() {

    companion object{
        const val RC_SIGN_IN = 100
    }

    private lateinit var mAuth: FirebaseAuth
    private lateinit var googleSignInClient: GoogleSignInClient


    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()

        //firebase auth instance
        mAuth = FirebaseAuth.getInstance()

        //configure Google Sign-in
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        googleSignInClient = GoogleSignIn.getClient(this,gso)

        setContent{
            TODATheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)

                //pag tapos na si bernard sa UI itutuloy to
                //if (mAuth.currentUser == null) { }

                }
            }
        }




        private fun signIn() {
            val signInIntent = googleSignInClient.signInIntent
            startActivityForResult(signInIntent, RC_SIGN_IN)
        }

        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
             super.onActivityResult(requestCode, resultCode, data)

            // result returned from launching the intent from GoogleSignInApi.getSignInIntent()
            if (requestCode == RC_SIGN_IN) {
                val task = GoogleSignIn.getSignedInAccountFromIntent(data)
                val exception = task.exception
                if (task.isSuccessful) {
                    try {
                        // Google Sign in was successful, authenticate with Firebase
                        val account = task.getResult(ApiException::class.java)!!
                        firebaseAuthWithGoogle(account.idToken!!)

                    } catch (e: Exception) {
                        // Google Sign in failed
                        Log.d("SignIn", "Google SignIn Failed")
                    }

                } else  {
                    Log.d("SignIn", exception.toString())
                }
            }

        }

        private fun firebaseAuthWithGoogle(idToken: String) {
            val credential = GoogleAuthProvider.getCredential(idToken, null)
            mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // SignIn Successful
                        Toast.makeText(this, "SignIn Successful", Toast.LENGTH_SHORT).show()
                        //setContent{  (TANGGALIN LAHAT NG SLASH INCLUDING THIS MESSAGE)
                            //TODATheme {
                                //val user: FirebaseUser = mAuth.currentUser!!
                                //NamengscreennadapatkasamanayungMAP(
                                    //profileimage = user.photoUrl!!,
                                    //name = user.displayName!!,
                                    //email = user.email!!
                                //)
                            //}
                        //}
                    } else  {
                        // SignIn Failed
                        Toast.makeText(this, "SignIn Failed", Toast.LENGTH_SHORT).show()
                    }
                }
        }

    }
