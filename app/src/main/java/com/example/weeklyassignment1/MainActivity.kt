package com.example.weeklyassignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weeklyassignment1.ui.theme.WeeklyAssignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeeklyAssignment1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
                MovieCard(Card("Cinderella", "1950"))
            }
        }
    }

        // Add multiple texts
        data class Card(val movieName: String, val movieYear: String)

        @Composable
        fun MovieCard(msg: Card) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
            )
            {
                Row(
                    modifier = Modifier
                        .padding(all = 8.dp)
                        .align(Alignment.Center)
                ) {

                    Spacer(modifier = Modifier.width(2.dp))

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.cinderella),
                            contentDescription = "profile picture",
                            modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp)
                        )

                        Spacer(modifier = Modifier.height(4.dp)) // Reduced space

                        Text(text = msg.movieName, fontWeight = FontWeight.Bold, fontSize = 29.sp)
                        Spacer(modifier = Modifier.height(8.dp))

                        // Row with movie year and resolution buttons (720p, 1080p)
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(text = msg.movieYear, fontSize = 24.sp)

                            // Space between the year and the resolution buttons
                            Spacer(modifier = Modifier.width(8.dp))

                            // 720p button
                            Button(
                                onClick = { },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Gray,
                                    contentColor = Color.White
                                ),
                                modifier = Modifier.padding(end = 8.dp)
                            ) {
                                Text(text = "720p")
                            }

                            // 1080p button
                            Button(
                                onClick = { },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Gray,
                                    contentColor = Color.White
                                ),
                                modifier = Modifier.padding(end = 8.dp)
                            ) {
                                Text(text = "1080p")
                            }
                        }

                        // Play Button
                        Spacer(modifier = Modifier.height(6.dp)) // Space between follower count and Play button

                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.White,
                                contentColor = Color.Black
                            ),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 8.dp)
                        ) {
                            Text(text = "Play")
                        }

                        Spacer(modifier = Modifier.height(6.dp))

                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.White,
                                contentColor = Color.Black
                            ),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 8.dp)
                        ) {
                            Text(text = "Download")
                        }

                        Text(text = "Cinderella, American animated film, released in 1950, that was made by Walt Disney and was based on the fairy tale by Charles Perrault. In this fairly faithful rendering of the classic tale, a beautiful young girl is forced into virtual slavery by her cruel, exploitative stepmother and jealous.")

                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.White,
                                contentColor = Color.Black
                            ),
                        ) {
                            Text(text = "Watch List")
                        }
                    }

                }
            }
        }

    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeeklyAssignment1Theme {
        Greeting("Android")
    }
}