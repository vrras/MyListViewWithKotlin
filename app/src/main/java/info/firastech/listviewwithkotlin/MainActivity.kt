package info.firastech.listviewwithkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast

class MainActivity : AppCompatActivity() {

    // Buat data array
    val data_item = arrayOf("Kotlin", "Java", "PHP", "C##", "C++", "Phyton", "Groovy")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // buat adapter
        val adapaterList = ArrayAdapter<String>(this@MainActivity,
                android.R.layout.simple_list_item_1,
                data_item)
        // Set adapter ke widget
        lvKotlin.adapter = adapaterList
        //event on Item Click
        lvKotlin.setOnItemClickListener { adapterView, view, i, l ->
            //Tampilkan Toast
//            Toast.makeText(this@MainActivity,
//                            "${data_item.get(i)} selected!",
//                            Toast.LENGTH_LONG)
//                            .show()
            //Toast Anko
            longToast("${data_item.get(i)} selected!")
            //Snackbar Anko

        }
    }
}
