package com.jgabrielfreitas.provider.demo.view.ui

import com.jgabrielfreitas.alfred.Alfred
import com.jgabrielfreitas.layoutid.activity.InjectLayoutBaseActivity

/**
 * Created by JGabrielFreitas on 30/12/16.
 */

abstract class BaseActivity : InjectLayoutBaseActivity() {

  override fun onStart() {
    super.onStart()
    Alfred.register(this)
  }

}
