package com.valashko.xaapi.command;

import java.nio.charset.StandardCharsets;

public class GetIdListCommand implements ICommand {
    public GetIdListCommand() {}

    @Override
    public byte[] toBytes() {
        return "{\"cmd\":\"get_id_list\"}".getBytes(StandardCharsets.US_ASCII);
    }
}
