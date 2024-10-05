package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Activité principale de l'application.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialScreen()
        }
    }
}

/**
 * Composant composable affichant l'écran du tutoriel Jetpack Compose.
 */
@Composable
fun ComposeTutorialScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize() // Remplit toute la taille de l'écran
            .padding(16.dp), // Ajoute une marge de 16 dp autour du contenu
        horizontalAlignment = Alignment.CenterHorizontally, // Alignement horizontal au centre
        verticalArrangement = Arrangement.Top // Alignement vertical en haut
    ) {
        // Affiche l'image du tutoriel
        Image(
            painter = painterResource(id = R.drawable.compose_image), // Charge l'image depuis le dossier drawable
            contentDescription = null, // Description de l'image (facultatif)
            modifier = Modifier.fillMaxWidth(), // Remplit la largeur de l'écran
            contentScale = ContentScale.Fit // Ajuste l'image à la taille du conteneur
        )

        // Affiche le titre du tutoriel
        Text(
            text = "Jetpack Compose tutorial", // Titre du tutoriel
            fontSize = 24.sp, // Définit la taille de la police à 24sp
            modifier = Modifier.padding(bottom = 16.dp) // Ajoute une marge de 16 dp en bas
        )

        // Affiche la description du tutoriel
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.", // Description du tutoriel
            modifier = Modifier.padding(vertical = 16.dp), // Ajoute une marge de 16 dp en haut et en bas
            textAlign = TextAlign.Justify // Aligne le texte de manière justifiée
        )

        // Affiche l'explication du tutoriel
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.", // Explication du tutoriel
            modifier = Modifier.padding(vertical = 16.dp), // Ajoute une marge de 16 dp en haut et en bas
            textAlign = TextAlign.Justify // Aligne le texte de manière justifiée
        )
    }
}

/**
 * Aperçu de l'écran du tutoriel pour le développement.
 */
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTutorialScreen()
}
