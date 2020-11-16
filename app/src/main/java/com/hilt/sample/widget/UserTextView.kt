package com.hilt.sample.widget

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.hilt.sample.data.GoodUser
import com.hilt.sample.data.User
import com.hilt.sample.hilt.AUser
import com.hilt.sample.hilt.BUser
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * 界面描述：
 * <p>
 * Created by tianyang on 2020/11/16.
 */
@AndroidEntryPoint
class UserTextView(context: Context, attrs: AttributeSet?) : AppCompatTextView(context, attrs) {

    @Inject
    lateinit var user: User

    @AUser
    @Inject
    lateinit var aUser: GoodUser

    @BUser
    @Inject
    lateinit var bUser: GoodUser

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        text = "${user.name}的心情是${user.mood}"

//        text = "${aUser.id} ${aUser.user.name}的心情是${aUser.user.mood}"

//        text = "${bUser.id} ${bUser.user.name}的心情是${bUser.user.mood}"
    }

}