import React from 'react'
type PersonProps = {
    name: {
        first: string,
        last: string,
    }
}
export default function Person(props: PersonProps) {
    return (
        <div>
            <h1>{props.name.first} {props.name.last}</h1>
        </div>
    )
}
