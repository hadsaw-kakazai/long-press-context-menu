package com.example.longpresscontextmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.mainmenu,menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }


    private val actionModeCallback = object : ActionMode.Callback {
        // Called when the action mode is created; startActionMode() was called
        override fun onCreateActionMode(mode: ActionMode, menu: Menu): Boolean {
            // Inflate a menu resource providing context menu items
            val inflater: MenuInflater = mode.menuInflater
            inflater.inflate(R.menu.mainmenu, menu)
            return true
        }

        // Called each time the action mode is shown. Always called after onCreateActionMode, but
        // may be called multiple times if the mode is invalidated.
        override fun onPrepareActionMode(mode: ActionMode, menu: Menu): Boolean {
            return false // Return false if nothing is done
        }

        // Called when the user selects a contextual menu item
        override fun onActionItemClicked(mode: ActionMode, item: MenuItem): Boolean {
//            return when (item.itemId) {
//                R.id.one -> {
//                    shareCurrentItem()
//                    mode.finish() // Action picked, so close the CAB
//                    true
//                }
//                else -> false
//            }
            return false
        }

        override fun onDestroyActionMode(p0: ActionMode?) {
//            TODO("Not yet implemented")
        }

        // Called when the user exits the action mode

    }


    fun longclick(view:View){


              val  actionMode = startActionMode(actionModeCallback)

        }
    }

