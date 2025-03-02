package com.thomasberbigier.noteapp.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.thomasberbigier.noteapp.NOTES_CONFIG
import com.thomasberbigier.noteapp.NoteRepository
import com.thomasberbigier.noteapp.model.NoteModel

class NoteViewModel: ViewModel() {

    private lateinit var noteRepository: NoteRepository
    lateinit var notesLiveData: LiveData<List<NoteModel>>

    fun setSharedPreferences(context: Context) {
        val sharedPreferences = context.getSharedPreferences(NOTES_CONFIG, Context.MODE_PRIVATE)
        noteRepository = NoteRepository(sharedPreferences)
        notesLiveData = noteRepository.getSavedNotes().asLiveData()
    }

    fun saveNotes(notesToSave: List<NoteModel>) {
        noteRepository.saveNotes(notesToSave)
    }
}