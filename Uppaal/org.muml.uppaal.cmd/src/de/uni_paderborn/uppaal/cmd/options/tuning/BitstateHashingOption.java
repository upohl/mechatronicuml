package de.uni_paderborn.uppaal.cmd.options.tuning;

import org.muml.core.common.cmd.Option;

import de.uni_paderborn.uppaal.cmd.VerifyTACommand;

public class BitstateHashingOption extends Option<VerifyTACommand> {

	@Override
	public String getOption() {
		return "Z";
	}

}
