package com.github.aiappvideo.servertemplate;

import com.github.aiappvideo.core.meta.Extension;

public class ServerTemplateExtension implements Extension
{
    public static final String NAME = "server-template";

    @Override
    public String name()
    {
        return NAME;
    }
}
