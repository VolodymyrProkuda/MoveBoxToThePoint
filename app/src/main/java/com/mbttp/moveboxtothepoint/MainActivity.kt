package com.mbttp.moveboxtothepoint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mbttp.moveboxtothepoint.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val valuesOfIcons = listOf<Int>(R.drawable.move_box_on_dot_empty,R.drawable.move_box_on_dot_dot,
    R.drawable.move_box_on_dot_box,R.drawable.move_box_on_dot_men)

    val valuesOfField = mutableListOf<Int>(
        1,2,0,3,
        0,0,0,0,
        2,1,2,2,
        1,    1
    )

    var man = 3
    var box1 = 1
    var box2 = 8
    var box3 = 10
    var box4 = 11


    val valuesOfBaseField = mutableListOf<Int>(
        1,0,0,0,
        0,0,0,0,
        0,1,0,0,
        1,    1
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        boxAndOtherDraw()
        binding.imageView.setOnClickListener { clickToManMove(0) ; boxAndOtherDraw() }
        binding.imageView2.setOnClickListener { clickToManMove(1); boxAndOtherDraw() }
        binding.imageView3.setOnClickListener { clickToManMove(2); boxAndOtherDraw() }
        binding.imageView4.setOnClickListener { clickToManMove(3); boxAndOtherDraw() }
        binding.imageView5.setOnClickListener { clickToManMove(4); boxAndOtherDraw() }
        binding.imageView6.setOnClickListener { clickToManMove(5); boxAndOtherDraw() }
        binding.imageView7.setOnClickListener { clickToManMove(6); boxAndOtherDraw() }
        binding.imageView8.setOnClickListener { clickToManMove(7); boxAndOtherDraw() }
        binding.imageView9.setOnClickListener { clickToManMove(8); boxAndOtherDraw() }
        binding.imageView10.setOnClickListener { clickToManMove(9); boxAndOtherDraw() }
        binding.imageView11.setOnClickListener { clickToManMove(10); boxAndOtherDraw() }
        binding.imageView12.setOnClickListener { clickToManMove(11); boxAndOtherDraw() }
        binding.imageView13.setOnClickListener { clickToManMove(12); boxAndOtherDraw() }
        binding.imageView14.setOnClickListener { clickToManMove(13); boxAndOtherDraw() }




    }

    fun boxAndOtherDraw(){
        binding.imageView.setImageResource(valuesOfIcons[valuesOfField[0]])
        binding.imageView2.setImageResource(valuesOfIcons[valuesOfField[1]])
        binding.imageView3.setImageResource(valuesOfIcons[valuesOfField[2]])
        binding.imageView4.setImageResource(valuesOfIcons[valuesOfField[3]])
        binding.imageView5.setImageResource(valuesOfIcons[valuesOfField[4]])
        binding.imageView6.setImageResource(valuesOfIcons[valuesOfField[5]])
        binding.imageView7.setImageResource(valuesOfIcons[valuesOfField[6]])
        binding.imageView8.setImageResource(valuesOfIcons[valuesOfField[7]])
        binding.imageView9.setImageResource(valuesOfIcons[valuesOfField[8]])
        binding.imageView10.setImageResource(valuesOfIcons[valuesOfField[9]])
        binding.imageView11.setImageResource(valuesOfIcons[valuesOfField[10]])
        binding.imageView12.setImageResource(valuesOfIcons[valuesOfField[11]])
        binding.imageView13.setImageResource(valuesOfIcons[valuesOfField[12]])
        binding.imageView14.setImageResource(valuesOfIcons[valuesOfField[13]])



    }
    fun clickToManMove(n:Int){

        if ((n == (box1)) && (n == (man-1))) {box1-=1;valuesOfField[n-1]=2}
        if ((n == (box2)) && (n == (man+4))) {box2+=4;valuesOfField[n+4]=2}
        if ((n == (box3)) && (n == (man-1))) {box3-=1;valuesOfField[n-1]=2}
        if ((n == (box4)) && (n == (man+4))) {box4+=2;valuesOfField[n+2]=2}


        if (n == (man-1)) {valuesOfField[n] = 3; valuesOfField[n+1]=valuesOfBaseField[n+1]; man=man-1 }
        if (n == (man+1)) {valuesOfField[n] = 3; valuesOfField[n-1]=valuesOfBaseField[n-1]; man=man+1 }
        if (n == (man+4)) {valuesOfField[n] = 3; valuesOfField[n-4]=valuesOfBaseField[n-4]; man=man+4 }
        if (n == (man-4)) {valuesOfField[n] = 3; valuesOfField[n+4]=valuesOfBaseField[n+4]; man=man-4 }



    }

}