package com.example.affirmedme.views.fragments.homeFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.affirmedme.adapters.GoalsAdapter
import com.example.affirmedme.databinding.FragmentHomeBinding
import com.example.affirmedme.viewmodel.ViewModelMember

class HomeFragment : Fragment() {
    private lateinit var viewModel: ViewModelMember
    private lateinit var goalsAdapter: GoalsAdapter
    private lateinit var viewBinding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentHomeBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(ViewModelMember::class.java)
        setGoals()
        setModules()
    }

    private fun setModules() {
        viewModel.getGoalsList().observe(viewLifecycleOwner, {
            goalsAdapter = GoalsAdapter(requireContext(), it)
            viewBinding.rcvModules.adapter = goalsAdapter
            goalsAdapter.notifyDataSetChanged()
        })
    }

    private fun setGoals() {
        viewModel.getGoalsList().observe(viewLifecycleOwner, {
            goalsAdapter = GoalsAdapter(requireContext(), it)
            viewBinding.rcvGoals.adapter = goalsAdapter
            goalsAdapter.notifyDataSetChanged()
        })
    }
}