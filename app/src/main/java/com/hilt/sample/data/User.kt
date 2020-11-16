package com.hilt.sample.data

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Singleton

/**
 * 界面描述：
 * <p>
 * Created by tianyang on 2020/11/16.
 */
//@Singleton //全局共享
@ActivityScoped
open class User constructor(var id: Int, var name: String, var mood: String) {

//    @Inject
//    constructor() : this(1, "新用户", "毫无波澜")

}

