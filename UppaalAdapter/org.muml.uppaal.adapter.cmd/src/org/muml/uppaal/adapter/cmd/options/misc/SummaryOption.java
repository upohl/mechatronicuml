package org.muml.uppaal.adapter.cmd.options.misc;

import org.muml.core.common.cmd.Option;
import org.muml.uppaal.adapter.cmd.VerifyTACommand;

public class SummaryOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "u";
	}

}
