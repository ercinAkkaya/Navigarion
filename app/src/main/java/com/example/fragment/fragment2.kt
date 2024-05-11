package com.example.fragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class fragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button2: Button = view.findViewById(R.id.button2)

        //fragment1'den gelen argüman
        arguments?.let {
            val kullaniciAdi = fragment2Args.fromBundle(it).userName
            println(kullaniciAdi)
        }

        button2.setOnClickListener {
            val action = fragment2Directions.actionFragment2ToFragment1()
            Navigation.findNavController(it).navigate(action)
        }

    }

}