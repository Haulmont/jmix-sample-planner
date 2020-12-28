package com.company.planner.screen.speaker;

import com.company.planner.entity.Speaker;
import io.jmix.ui.screen.LookupComponent;
import io.jmix.ui.screen.StandardLookup;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("plnnr_Speaker.browse")
@UiDescriptor("speaker-browse.xml")
@LookupComponent("speakersTable")
public class SpeakerBrowse extends StandardLookup<Speaker> {
}