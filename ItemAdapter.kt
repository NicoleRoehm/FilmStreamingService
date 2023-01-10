package de.syntax_institut.filmestreamingservice.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.syntax_institut.filmestreamingservice.R
import de.syntax_institut.filmestreamingservice.data.model.MovieTitle

/**
 * Der Item Adapter weist den views im ViewHolder den Inhalt zu
 */
class ItemAdapter(
    private val context: Context,
    private val dataset: List<MovieTitle>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /**
     * der ViewHolder umfasst die View uns stellt einen Listeneintrag dar
     */
    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // TODO Schreibe hier deinen Code
        val filmtiteltext = itemView.findViewById<TextView>(R.id.film_Titel)

    }

    /**
     * hier werden neue ViewHolder erstellt
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        // das itemLayout wird zur ItemView aufgeblasen
        // TODO Schreibe hier deinen Code
        val adapterLayout = LayoutInflater.from (parent.context)
            .inflate(R.layout.list_item, parent, false)
        // und in einem ViewHolder zurückgegeben
        return ItemViewHolder(adapterLayout)          //TODO("Liefere das Ergebnis zurück")
    }

    /**
     * hier findet der Recyclingprozess statt
     * die vom ViewHolder bereitgestellten Parameter erhalten die Information des Listeneintrags
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // Hole das movieTitle Objekt für die enthaltenen Informationen
        // TODO Schreibe hier deinen Code
        val movieTitle = dataset[position]

        // Hole die TextView aus dem ViewHolder
        // TODO Schreibe hier deinen Code
        val filmtitel = holder.filmtiteltext

        holder.filmtiteltext.text = context.getString(movieTitle.stringResource)
        // Setze den Text
        // TODO Schreibe hier deinen Code

    }

    /**
     * damit der LayoutManager weiß, wie lang die Liste ist
     */
    override fun getItemCount(): Int {
        return dataset.size //TODO()
    }
}
