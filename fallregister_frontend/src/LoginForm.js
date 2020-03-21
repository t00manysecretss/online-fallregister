
import React from 'react';

import {FormLabel, Input, Grid, Button} from '@material-ui/core/';

class CSVImportForm extends React.Component {
    render(){

        return(
            <form action="/action_page.php">
            <Grid container direction='column' justify="center">

                <Grid>
                <FormLabel for="fname">Vorname:</FormLabel>
                <Input type="text" id="fname" name="fname"></Input>
                </Grid>

                <Grid>
                <FormLabel for="lname">Nachname:</FormLabel>
                <Input type="text" id="lname" name="lname"></Input>
                </Grid>

                <Grid>
                    <Button type="submit" value="Submit" variant="contained" color="primary" m={2}>Login</Button>
                </Grid>

            </Grid>
            </form>
    );
    }
}

export default CSVImportForm;