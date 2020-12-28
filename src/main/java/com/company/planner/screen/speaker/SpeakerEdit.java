package com.company.planner.screen.speaker;

import com.company.planner.entity.Speaker;
import io.jmix.ui.screen.EditedEntityContainer;
import io.jmix.ui.screen.StandardEditor;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("plnnr_Speaker.edit")
@UiDescriptor("speaker-edit.xml")
@EditedEntityContainer("speakerDc")
public class SpeakerEdit extends StandardEditor<Speaker> {
}