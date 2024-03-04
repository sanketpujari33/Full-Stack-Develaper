type GreetProps = {
    name: string,
    massageCount?: number,
    isLoggedIn: boolean

}
export default function Greet(props: GreetProps) {
    const { massageCount = 0 } = props;
    return (
        <>
            <h2>
                {
                    props.isLoggedIn ?
                        ` Welcome ${props.name}! You have ${props.massageCount} unread messages`
                        : `Welcome Guest`
                }
            </h2>
        </>
    )
}
