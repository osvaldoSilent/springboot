package com.osvaldevops.relearn.repo_imp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class RepositoryEvent {

    private final OffsetDateTime creationTime;
    private final Actor actor;

    @JsonCreator
    public  RepositoryEvent(

            @JsonProperty("created_at") OffsetDateTime creationTime,
            @JsonProperty("user") Actor actor
    ){


        System.out.println(creationTime);

        System.out.println(actor);


        this.creationTime = creationTime;
        this.actor = actor;
        System.out.println(this.creationTime);
        System.out.println(this.actor);
    }

    public OffsetDateTime getCreationTime() {
        return creationTime;
    }

    public Actor getActor() {
        return actor;
    }

    public enum Type{
        CLOSED("closed"),
        REOPENED("reopened"),
        SUBSCRIBED("subscribed"),
        UNSUBSCRIBED("unsubscribed"),
        MERGED("merged"),
        REFERENCED("referenced"),
        MENTIONED("mentioned"),
        ASSIGNED("assigned"),
        UNASSIGNED("unassigned"),
        LABELED("labeled"),
        UNLABELED("unlabeled"),
        MILESTONED("milestoned"),
        DEMILESTONED("demilestoned"),
        RENAMED("renamed"),
        LOCKED("locked"),
        UNLOCKED("unlocked"),
        HEAD_REF_DELETED("head_ref_deleted"),
        HEAD_REF_RESTORED("head_ref_restored"),
        CONVERTED_NOTE_TO_ISSUE("converted_note_to_issue"),
        MOVED_COLUMNS_IN_PROJECT("moved_columns_in_project"),
        MARKED_AS_DUPLICATE("marked_as_duplicate-"),
        USER("user");

        private String type;
        Type(String type) {
            this.type = type;
        }
        static Type valueFRpm(String type){
            for(Type value: values()){
                if(type.equals(value.type)) return value;
            }
            throw new IllegalArgumentException("" + type +"is not a valid type");
        }

    }
}
