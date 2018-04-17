package com.liubase.groups.groupuser

import android.support.v4.app.*
import com.liubase.groups.groupmain.*

/* Created by Jeffrey Liu on 11/04/2018. */
class UserModule: BaseModule() {
    
    override fun entryFragment() : Fragment {
        val f = GroupFragment()
        f.module = this
        return f
    }
}