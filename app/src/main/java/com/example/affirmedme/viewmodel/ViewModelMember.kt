package com.example.affirmedme.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.affirmedme.Repository
import com.example.affirmedme.model.Goals
import com.example.affirmedme.model.InviteMember

class ViewModelMember : ViewModel() {
    private var repository = Repository()
    private lateinit var listMember: MutableLiveData<ArrayList<InviteMember>>
    private lateinit var listGoals: MutableLiveData<ArrayList<Goals>>

    fun getMemberList(): LiveData<ArrayList<InviteMember>> {
        if (!::listMember.isInitialized) {
            listMember = repository.getMemberData()
        }
        return listMember
    }

    fun getGoalsList(): LiveData<ArrayList<Goals>> {
        if (!::listGoals.isInitialized) {
            listGoals = repository.getGoalsData()
        }
        return listGoals
    }
}