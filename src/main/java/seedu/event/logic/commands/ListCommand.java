package seedu.event.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.event.model.Model.PREDICATE_SHOW_ALL_EVENTS;

import seedu.event.model.Model;

/**
 * Lists all events in the event book to the user.
 */
public class ListCommand extends Command {

    public static final String COMMAND_WORD = "list";

    public static final String MESSAGE_SUCCESS = "Listed all events";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredEventList(PREDICATE_SHOW_ALL_EVENTS);
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
