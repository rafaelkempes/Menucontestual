package com.example.menucontestual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.menucontestual.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imagen = binding.usuario
        //Registar la vista sobre la que va qa parecer el menu
        registerForContextMenu(imagen)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.menu_contestual,menu)
        menu.setHeaderTitle("Menu contextual")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.Descargar ->{
                Toast.makeText(this,"opcion descargar",Toast.LENGTH_LONG).show()
                true
            }
            R.id.Compartir ->{
                Toast.makeText(this,"opcion compartir",Toast.LENGTH_LONG).show()
                true
            }
            R.id.copiar ->{
                Toast.makeText(this,"opcion copiar",Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
}

