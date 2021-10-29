package com.example.affirmedme.views.fragments.inviteFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmedme.R
import com.example.affirmedme.adapters.InviteAdapter
import com.example.affirmedme.databinding.InviteAppBinding
import com.example.affirmedme.viewmodel.ViewModelMember

class InviteApp : Fragment() {
    private lateinit var viewBinding: InviteAppBinding
    private lateinit var viewModel: ViewModelMember
    private lateinit var memberAdapter: InviteAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        viewBinding = InviteAppBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(ViewModelMember::class.java)
        setMember()
        clickListener()
    }

    private fun clickListener() {
//        viewBinding.viewMember.btnInviteMember.setOnClickListener {
//            Navigation.findNavController(it).navigate(R.id.action_inviteApp_to_inviteMember)
//        }
    }

    private fun setMember() {
        viewModel.getMemberList().observe(viewLifecycleOwner, {
            memberAdapter = InviteAdapter(requireContext(), it)
            linearLayoutManager =
                LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
            viewBinding.listMember.layoutManager = linearLayoutManager
            viewBinding.listMember.adapter = memberAdapter
            memberAdapter.notifyDataSetChanged()
        })
    }
}
