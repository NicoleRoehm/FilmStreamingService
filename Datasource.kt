package de.syntax_institut.filmestreamingservice.data

import android.content.Context
import de.syntax_institut.filmestreamingservice.data.model.MovieTitle

/**
 * Diese Klasse bereitet Daten aus den Ressourcen auf
 */
class Datasource(private val context: Context) {

    private val numberOfTitles = 30 // anpassen, wenn Anzahl an Filmtiteln geändert wurde

    /**
     * Diese Funktion holt die Filmtitel aus der string Quelldatei
     * und liefert eine Liste aus Titlen zurück
     */
    fun loadTitles(): List<MovieTitle> {
        // Die Liste an Filmtiteln
        val movieTitles = mutableListOf<MovieTitle>()

        // Befülle die Liste
        for (index in 1..numberOfTitles) {

            // Hole den Titel
            val title = getTitle(index)

            // Füge ein MovieTitle Objekt hinzu
            movieTitles.add(

                MovieTitle(title)

            )
        }
        return movieTitles
    }

    /**
     * Diese Funktion liefert den Titel Nummer index aus der Quelle
     */
    private fun getTitle(index: Int): Int {
        return context.resources.getIdentifier(
            "movieTitle$index",
            "string",
            context.packageName
        )
    }
}