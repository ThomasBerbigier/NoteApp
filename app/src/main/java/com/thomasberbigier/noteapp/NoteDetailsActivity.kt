package com.thomasberbigier.noteapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NoteDetailsActivity : AppCompatActivity() {

    lateinit var noteTitleEditText: EditText
    lateinit var noteDescEditText: EditText
    lateinit var updateNoteButton: Button

    var noteTitle: String? = null
    var noteDesc: String? = null
    var notePosition: Int? = null
    var isUpdated: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_note_details)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initViews()
        fetchData()

        updateNoteButton.setOnClickListener {
            noteTitle = noteTitleEditText.text.toString()
            noteDesc = noteDescEditText.text.toString()
            isUpdated = true
            Toast.makeText(this, getString(R.string.note_updated), Toast.LENGTH_LONG).show()
        }

        // Gestion du bouton retour avec OnBackPressedDispatcher
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (isUpdated) {
                    val intent = Intent().apply {
                        putExtra(NOTE_TITLE, noteTitle)
                        putExtra(NOTE_DESC, noteDesc)
                        putExtra(NOTE_POSITION, notePosition)
                    }
                    setResult(Activity.RESULT_OK, intent)
                }
                finish() // Ferme l'activité
            }
        })
    }

    private fun fetchData() {
        if (intent.hasExtra(NOTE_TITLE)) {
            noteTitle = intent.getStringExtra(NOTE_TITLE)
            noteDesc = intent.getStringExtra(NOTE_DESC)
            notePosition = intent.getIntExtra(NOTE_POSITION,-1)
            noteTitleEditText.setText(noteTitle)
            noteDescEditText.setText(noteDesc)
        }
    }

    private fun initViews() {
        noteTitleEditText = findViewById(R.id.note_title_edit_text)
        noteDescEditText = findViewById(R.id.note_desc_edit_text)
        updateNoteButton = findViewById(R.id.update_note_button)
    }
}