package com.liubase.groups.groupuser

import android.os.*
import android.support.v4.app.*
import android.view.*
import android.widget.*
import com.liubase.groups.groups.*

/* Created by Jeffrey Liu on 11/04/2018. */
class GroupFragment : Fragment() {
    private val myTag = "Group Fragment"
    
    lateinit var module : UserModule
    private lateinit var lView : LinearLayout
    
    override fun onCreateView(inflater : LayoutInflater, container : ViewGroup?,
            savedInstanceState : Bundle?) : View? {
        lView = inflater.inflate(R.layout.user_group, container, false) as LinearLayout
        
        val title = lView.findViewById(R.id.toolbar_title) as TextView
        title.setText(R.string.user_app_name)
        
        return lView
    }
}