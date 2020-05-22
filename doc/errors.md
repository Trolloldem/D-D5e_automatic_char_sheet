# Errors
1. [Error phases](#phase)
2. [Parsing errors](#parsing)
3. [Visiting errors](#visit)
4. [Naming errors](#name)
5. [Setting errors](#settings)

## Error phases<a name ="phase"/>
Validation on the provided file follows 4 phases. A valid file must pass a check phase before
being checked by next one. Only files that pass the last phase will be used to create the corresponding PDF files.
All the errors inside a phase will be printed, in this way users can correct all errors of a certain type.