package com.example.affirmedme

import androidx.lifecycle.MutableLiveData
import com.example.affirmedme.model.Goals
import com.example.affirmedme.model.InviteMember

class Repository {
    private var inviteMember = arrayListOf<InviteMember>()
    private lateinit var listMember: MutableLiveData<ArrayList<InviteMember>>

    private var goals = arrayListOf<Goals>()
    private lateinit var listGoals: MutableLiveData<ArrayList<Goals>>

    fun getMemberData(): MutableLiveData<ArrayList<InviteMember>> {
        if (!::listMember.isInitialized) {
            listMember = MutableLiveData()
            setMemberData()
        }
        return listMember
    }

    fun getGoalsData(): MutableLiveData<ArrayList<Goals>> {
        if (!::listGoals.isInitialized) {
            listGoals = MutableLiveData()
            setGoalsData()
        }
        return listGoals
    }

    private fun setGoalsData() {
        goals.add(Goals("CHARACTER"))
        goals.add(Goals("FINANCES"))
        goals.add(Goals("HEALTH"))
        goals.add(Goals("CHARACTER"))
        goals.add(Goals("CHARACTER"))
        goals.add(Goals("MINDSET"))
        goals.add(Goals("RELATIOONSHIPS"))
        listGoals.value = goals

    }


    private fun setMemberData() {
        inviteMember.add(
            InviteMember(
                R.drawable.ic_round_image,
                "ftab Abbas",
                R.drawable.ic_phone,
                "+92445322908"
            )
        )
        inviteMember.add(
            InviteMember(
                R.drawable.ic_round_image,
                "ftab Abbas",
                R.drawable.ic_phone,
                "+92445322908"
            )
        )
        inviteMember.add(
            InviteMember(
                R.drawable.ic_round_image,
                "ftab Abbas",
                R.drawable.ic_phone,
                "+92445322908"
            )
        )
        inviteMember.add(
            InviteMember(
                R.drawable.ic_round_image,
                "ftab Abbas",
                R.drawable.ic_phone,
                "+92445322908"
            )
        )
        inviteMember.add(
            InviteMember(
                R.drawable.ic_round_image,
                "ftab Abbas",
                R.drawable.ic_phone,
                "+92445322908"
            )
        )
        inviteMember.add(
            InviteMember(
                R.drawable.ic_round_image,
                "ftab Abbas",
                R.drawable.ic_phone,
                "+92445322908"
            )
        )
        listMember.value = inviteMember
    }

}