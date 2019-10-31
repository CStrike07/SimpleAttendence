package com.example.simpleattendence


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

/**
 * A simple [Fragment] subclass.
 */
class StartPage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val iAmAStudent = view.findViewById<Button>(R.id.iamastudentbtn)

        iAmAStudent.setOnClickListener{
            val mainActivity: MainActivity = activity as MainActivity
            mainActivity.StudentSignupPage()
        }
    }
}
