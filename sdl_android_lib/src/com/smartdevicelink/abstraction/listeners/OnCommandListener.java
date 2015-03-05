package com.smartdevicelink.abstraction.listeners;

import com.smartdevicelink.proxy.rpc.OnCommand;

public interface OnCommandListener extends NotificationListener {

	public void handleCommand(OnCommand command);
	
}
